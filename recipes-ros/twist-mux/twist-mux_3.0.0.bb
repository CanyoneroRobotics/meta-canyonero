DESCRIPTION = "Twist multiplexer."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=6bc0e2b80b41b84c8240cea714dea709"

SRC_URI = "https://github.com/ros-teleop/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4de9ac24d3fd138b3e2c62d7b286fbb9"
SRC_URI[sha256sum] = "d9058c3d17fae101ce5a8b2e756337546f710660566853e3626e8af7b4948596"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

DEPENDS = "visualization-msgs"

RDEPENDS_${PN} = "rosconsole roscpp xmlrpcpp"
