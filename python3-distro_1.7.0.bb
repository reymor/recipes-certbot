SUMMARY = "Distro - an OS platform information API"
HOMEPAGE = "https://github.com/python-distro/distro"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

SRC_URI = "git://github.com/python-distro/distro.git;protocol=https;branch=master"

PV = "1.7.0+git${SRCPV}"
SRCREV = "697b2dbb20ab12cb86becf57f062645de723d5ac"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-core python3-json python3-pprint python3-pytest"
