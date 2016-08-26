DESCRIPTION = "Provides a ROS package for the Canyonero Project"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "https://github.com/CanyoneroRobotics/${ROS_SPN}/archive/${PV}.tar.gz;branch=roscontrol;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a37af13a2848f35fa25beec462f99d1e"
SRC_URI[sha256sum] = "4d2b5a3608f16a9d0b95c200c8b5c85113c241e1d40e71fe90594d0c8499daec"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "TFM"
