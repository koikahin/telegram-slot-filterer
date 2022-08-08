Listens to the h1b/h4 visa dropbox slots channel, filters all 'NA' messages and sends remaining ones
to the 'filtered' channel. Further, it looks for patterns like 'bulk', 'lots of slots' etc. and sends 
them to the 'priority' channel. 

Relevant patterns are at: `src/main/kotlin/slotfilter/Consts.kt`
Tests for them are at: `src/test/kotlin/org/drinkless/tdlib/example/AllowedMessagesKtTest.kt`

Messages deleted/edited in the main channel are correspondingly deleted/edited in the forwarded 
channels on a best effort basis. 
