SUMMARY = "JOSE protocol implementation in Python"
HOMEPAGE = "https://github.com/certbot/josepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d2c2a5517cd7fd190a1aa6dfa23abb7a"

SRC_URI = "git://github.com/certbot/josepy.git;protocol=https;branch=master"

PV = "1.13.0+git${SRCPV}"
SRCREV = "10e2e3a1c09974d41097cc4c08f836421ce39f1b"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-core python3-pyopenssl"
