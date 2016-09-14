DESCRIPTION = "Provides a ROS package for the Canyonero Project"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://canyonero-init-env.sh"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
    install -d ${D}${sysconfdir}
    install -m 0755 ${WORKDIR}/canyonero-init-env.sh ${D}/${sysconfdir}
}
