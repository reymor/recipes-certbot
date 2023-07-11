require certbot.inc

SUMMARY = "ACME protocol implementation in Python"
HOMEPAGE = "https://github.com/letsencrypt/letsencrypt"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2c2a5517cd7fd190a1aa6dfa23abb7a"

PV = "2.6.0+git${SRCPV}"

S = "${WORKDIR}/git/acme"

inherit setuptools3

RDEPENDS:${PN} += "python3-core python3-crypt python3-cryptography python3-datetime \
                   python3-email python3-io python3-josepy python3-json python3-logging \
                   python3-netclient python3-netserver python3-pkg-resources python3-pyopenssl \
                   python3-pyrfc3339 python3-pytest python3-pytz python3-unittest python3-requests"
