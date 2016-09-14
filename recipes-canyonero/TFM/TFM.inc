DESCRIPTION = "Provides a ROS package for the Canyonero Project"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "https://github.com/CanyoneroRobotics/${ROS_SPN}/archive/${PV}.tar.gz;branch=roscontrol;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "de0751bf6799ba90254f0d81fa32b23c"
SRC_URI[sha256sum] = "a6eaf52caa079c653b596bbefbbb80be19f1b570c2da80624647329a51434f7b"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "TFM"
