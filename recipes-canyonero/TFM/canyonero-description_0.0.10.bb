DESCRIPTION = "Canyonero Base."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS = "controller-interface robot-pose-ekf libserial roslaunch roscpp rospy tf std-msgs sensor-msgs controller-manager hardware-interface roslint joy"

require TFM.inc
