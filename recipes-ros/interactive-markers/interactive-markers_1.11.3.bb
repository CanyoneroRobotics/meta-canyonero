DESCRIPTION = "Interactive marker library for RViz and similar visualizers."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

SRC_URI = "https://github.com/ros-visualization/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d70f33d95223e66b157a6543bac55711"
SRC_URI[sha256sum] = "85f9fc72045cac4ef873f80fca9ce2d7dcfee8762024dd07427431b32760551a"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} = "rosconsole roscpp rospy rostest std-msgs tf visualization-msgs"
