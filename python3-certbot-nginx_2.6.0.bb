require certbot.inc

SUMMARY = "Nginx plugin for Certbot"
HOMEPAGE = "https://github.com/letsencrypt/letsencrypt"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=76bc61270993bdcec50035bc9e60f8d5"

PV = "2.6.0+git${SRCPV}"

S = "${WORKDIR}/git/certbot-nginx"

inherit setuptools3

RDEPENDS:${PN} += "python3-acme python3-certbot python3-core python3-io python3-josepy \
                   python3-logging python3-pkg-resources python3-pyopenssl python3-pyparsing \
                   python3-pytest python3-shell python3-unittest python3-typing-extensions"
