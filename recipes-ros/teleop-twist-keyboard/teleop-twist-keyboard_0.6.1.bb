DESCRIPTION = "Simple keyboard teleop for twist robots."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/simium/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5817c811ac479696e2d1b0b66ddef7fc"
SRC_URI[sha256sum] = "10890a76cb4ddd61d7e3453761e23e1641fc194d0ba06a35f5b857988b4ca3bf"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "python-core python-pyserial geometry-msgs rospy"
