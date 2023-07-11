SUMMARY = "Generate and parse RFC 3339 timestamps"
HOMEPAGE = "https://github.com/kurtraschke/pyRFC3339"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=91b3003300a14a301fc1efc878bcee51"

SRC_URI = "git://github.com/kurtraschke/pyRFC3339;protocol=https;branch=master"

PV = "1.1+git${SRCPV}"
SRCREV = "e30cc1555adce0ecc7bd65509a2249d47e5a41b4"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-core python3-datetime python3-pytz"
