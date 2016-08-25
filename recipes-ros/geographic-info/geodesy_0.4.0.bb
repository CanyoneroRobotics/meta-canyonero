DESCRIPTION = "ROS packages for geographic information."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=5ee5b8b046ae48ad94a2037ca953a67b"

RDEPENDS_${PN} = "angles geographic-msgs geometry-msgs sensor-msgs tf unique-id uuid-msgs"

require geographic-info.inc
