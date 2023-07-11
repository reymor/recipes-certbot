SUMMARY = "Config file reading, writing and validation."
HOMEPAGE = "https://github.com/DiffSK/configobj"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d6f99b84d9a94610c62e48fa2e59e72"

SRC_URI = "git://github.com/DiffSK/configobj;protocol=https;branch=release"

PV = "5.0.7+git${SRCPV}"
SRCREV = "62c2c88688e5ff110792bb0d0547c5206bd036c7"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-core python3-distutils"
