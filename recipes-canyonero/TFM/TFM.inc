DESCRIPTION = "Provides a ROS package for the Canyonero Project"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "https://github.com/CanyoneroRobotics/${ROS_SPN}/archive/${PV}.tar.gz;branch=roscontrol;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "39b196bc587a2d4723fb49ee91701f08"
SRC_URI[sha256sum] = "80313a5939cdc7e818e0b9d68546656c4de0304625b29540a5656d62b1efdcb6"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "TFM"
