LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=34a845f28f361454a6913882b4d3bb53"

SRC_URI = "git://github.com/bear/parsedatetime.git;protocol=https;branch=master"

PV = "2.6+git${SRCPV}"
SRCREV = "c55337589ee582813182b74f2d3ae80e2fcd9738"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-core python3-datetime python3-email python3-logging \
                   python3-pytest python3-stringold python3-unittest"
