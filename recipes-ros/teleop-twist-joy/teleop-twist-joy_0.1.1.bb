DESCRIPTION = "Simple joystick teleop for twist robots."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros-teleop/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7f5f42fa055eebe369b9c31609c0a15e"
SRC_URI[sha256sum] = "57ade9e5da63187a1502e2119603d6338db7d6e2eada6fe5334fb0a7e74732ef"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "rosconsole roscpp roscpp-serialization"
