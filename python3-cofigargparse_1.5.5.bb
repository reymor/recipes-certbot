SUMMARY = "A drop-in replacement for argparse that allows options to also be set via config files and/or environment variables."
HOMEPAGE = "https://github.com/bw2/ConfigArgParse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da746463714cc35999ed9a42339f2943"

SRC_URI = "git://github.com/bw2/ConfigArgParse.git;protocol=https;branch=master"

PV = "1.5.5+git${SRCPV}"
SRCREV = "9aa0a011acde07706221c0a1b01553dd5cbe1098"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS:${PN} += "python3-core python3-json python3-shell python3-pyyaml python3-toml"
