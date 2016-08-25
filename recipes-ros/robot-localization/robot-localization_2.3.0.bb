DESCRIPTION = "robot_localization is a package of nonlinear state estimation nodes."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=00088837cb7bdb5710243b3ebb96ff5d"

SRC_URI = "https://github.com/cra-ros-pkg/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "00088837cb7bdb5710243b3ebb96ff5d"
SRC_URI[sha256sum] = "194984d16960b5630e351164b5e6a31e6c27bd3954457de013a411fcc1f7cd70"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "rosconsole roscpp roscpp-serialization"
