DESCRIPTION = "robot_localization is a package of nonlinear state estimation nodes."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros-visualization/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "61b87111f2d753261f471596cee24bf9"
SRC_URI[sha256sum] = "48c367a4ba4d294088464e62099a922884a886ea80222b1d1fe2426151096ad4"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "rosconsole roscpp roscpp-serialization libeigen"
