# recipes-certbot
Certbot recipes for Yocto Project

This recipes were tested on **Kirstone** branch. This include recipe for acme, cerbot, and cerbot-nginx plugin. 

`python3-charset-normalizer` was added because it is a dependency for requests. However, it is not include as a dependecy and in run time we got an error. In meta-python there are recipies for this. I include this because for request provide in poky it shall be ~= 2.0.0

There other recipes which are related with certbot.
