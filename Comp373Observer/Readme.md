# Obeserver Pattern

## Description

This is an example of the observer pattern. In the Main class
the pattern is demonstrated by simulating a news feed based application.
Three users are shown in the system and the all start off by subscribing to the 
feed. The feed then publishes a message that which all three user objects respond showing the observation.
A single user then unsubscribes and another message is sent by the feed. Only two user objects respond to the 
new message showing a successful unsubscribe event.