DESCRIPTION = "Provides a ROS package for the Canyonero Project"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "https://github.com/CanyoneroRobotics/${ROS_SPN}/archive/${PV}.tar.gz;branch=roscontrol;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "978dfd9c95b63318ae7ac8fb1f4852b9"
SRC_URI[sha256sum] = "e7a7115c63f593f84e46b047bc72fb017e451b067a563d7acf092ce97eaf5949"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "TFM"
