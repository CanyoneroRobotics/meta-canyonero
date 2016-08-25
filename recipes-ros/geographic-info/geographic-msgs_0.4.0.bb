DESCRIPTION = "ROS packages for geographic information."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=5ee5b8b046ae48ad94a2037ca953a67b"

RDEPENDS_${PN} = "geometry-msgs std-msgs uuid-msgs"

require geographic-info.inc
