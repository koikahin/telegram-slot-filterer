import platform
import os
import threading

os_type = platform.system()

announcement = "hear ye hear ye, slots opened..."

def _shout_sync(): 
    if os_type == 'Darwin': 
        os.system(f"say {announcement}")
    else: 
        os.system(f"espeak {announcement}")

def shout():
    th = threading.Thread(target=_shout_sync)
    th.start()
