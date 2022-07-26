import re

DISALLOWED = [
    r"\bNA\b",
    r"\bNOT AVAIL",
    r"\bnone avail",
    r"\bno slots avail",
    r"\bcrypto",
    r"\bmoney\b",
    r"\$[0-9]+",
    r"\$\$+",
    r"@AwesomeAdmin_US",
    r"@blackwidow",
    r"http://",
    r"https://",
    r"ping me",
    r"contact me",
    r"fake",
]

PRIORITY = [
    r"\bbulk\b",
    r"\blots\b.*of.*slots",
    r"\bmany\b.*avail",
    r"\bseveral\b.*avail",
]

DISALLOWED_PATTERNS = [re.compile(s, re.IGNORECASE) for s in DISALLOWED]
PRIORITY_PATTERNS = [re.compile(s, re.IGNORECASE) for s in PRIORITY]


def matches_any(patterns, text):
    for pattern in patterns:
        if pattern.search(text):
            return True
    return False


def should_forward(text) -> bool:
    return not matches_any(DISALLOWED_PATTERNS, text)


def is_priority(text) -> bool:
    return matches_any(PRIORITY_PATTERNS, text)


assert should_forward("NAa") == True
assert should_forward("NA") == False
assert should_forward("nA") == False
assert should_forward(" na") == False
assert should_forward("ana") == True
assert should_forward("n a") == True
assert should_forward("na all") == False
assert should_forward(".na") == False
assert should_forward("not av") == True
assert should_forward("not available") == False
assert should_forward("whynot available") == True
assert should_forward("none available") == False
assert should_forward("no slots available") == False
assert should_forward("ch, del no slots available") == False
assert should_forward("none available in che") == False
assert should_forward("anone avail") == True
assert should_forward("make money") == False
assert should_forward("get rich mining crypto") == False
assert should_forward("i earned $400") == False
assert should_forward("make $$$") == False
assert should_forward("make $") == True
assert should_forward("@AwesomeAdmin_US") == False
assert should_forward("@blackwidow") == False
assert should_forward("blackwidow") == True
assert should_forward("AwesomeAdmin_US") == True
assert should_forward("http") == True
assert should_forward("http:") == True
assert should_forward("http://") == False
assert should_forward("httpd") == True
assert should_forward("https://") == False
assert should_forward("https") == True
assert should_forward("PINg me for !") == False
assert should_forward("this is fake") == False
assert should_forward("contact me at 92832983") == False
assert should_forward("Pattern worked: Fresh H1B Dropbox Mumbai in Nov 2023") == True

assert is_priority("bulk") == True
assert is_priority("bulk available") == True
assert is_priority("Bulk Available") == True
assert is_priority("opened up in bulK") == True
assert is_priority("slots available in bulk") == True
assert is_priority("several slots are available") == True
assert is_priority("many slots are available") == True
assert is_priority("many slots are available in ch") == True
assert is_priority("several slots available in ch") == True
assert is_priority("several slots available in ch") == True
assert is_priority("severalare available") == False
