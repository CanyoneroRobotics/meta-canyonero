DESCRIPTION = "Canyonero Base."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

RDEPENDS_${PN} = "controller-interface libserial roslaunch roscpp rospy \
            tf std-msgs sensor-msgs controller-manager controller-manager-msgs hardware-interface roslint \
            teleop-twist-joy twist-mux joy"

require TFM.inc
