DESCRIPTION = "Provides a ROS package for the Canyonero Project"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "https://github.com/CanyoneroRobotics/${ROS_SPN}/archive/${PV}.tar.gz;branch=roscontrol;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f200d5b13929e7538605085e8374c68a"
SRC_URI[sha256sum] = "dd342812833efb44452d0ad4eba799bd0b36d7a341f8f47416a7f29c9035c670"

S = "${WORKDIR}/${ROS_SP}/canyonero_robot"

inherit catkin

RDEPENDS_${PN} = "libserial roslaunch roscpp rospy tf std-msgs sensor-msgs controller-manager hardware-interface roslint"
