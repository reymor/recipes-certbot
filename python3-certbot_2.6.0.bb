require certbot.inc

SUMMARY = "ACME client"
HOMEPAGE = "https://github.com/letsencrypt/letsencrypt"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=16542115f15152bdc6d80c5b5d208e70"

PV = "2.6.0+git${SRCPV}"

S = "${WORKDIR}/git/certbot"

inherit setuptools3

RDEPENDS:${PN} += "python3-configobj python3-core python3-crypt python3-cryptography \
                   python3-datetime python3-io python3-josepy python3-json python3-logging \
                   python3-math python3-multiprocessing python3-pkg-resources python3-pyopenssl \
                   python3-pyrfc3339 python3-pytest python3-pytz python3-shell python3-stringold \
                   python3-unittest python3-distro python3-requests python3-parsedatetime \
                   python3-cofigargparse"
