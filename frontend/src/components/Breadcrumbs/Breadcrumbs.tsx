import { ChevronRightIcon } from "@chakra-ui/icons";
import {
  Box,
  Breadcrumb,
  BreadcrumbItem,
  BreadcrumbLink,
  Flex,
  Text,
} from "@chakra-ui/react";
import React from "react";
import { Link } from "react-router-dom";
import { HomeIcon } from "../../img/Icons";

interface BreadcrumbsProps {
  secondPage: string;
  thirdPage: string;
}

const Breadcrumbs: React.FC<BreadcrumbsProps> = ({ secondPage, thirdPage }) => {
  return (
    <Box m={"40px 0 0"}>
      <Breadcrumb separator={<ChevronRightIcon color='#D1D1D1' boxSize={6} />}>
        <BreadcrumbItem>
          <BreadcrumbLink _hover={{ textDecoration: "none" }} as={Link} to='/' textDecoration={"underline"}>
            <Flex alignItems={"end"} gap={"3px"}>
              <HomeIcon />
              <Text
                lineHeight={"130%"}
                bgGradient='linear(92deg, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)'
                bgClip='text'>
                Home
              </Text>
            </Flex>
          </BreadcrumbLink>
        </BreadcrumbItem>

        <BreadcrumbItem>
          <BreadcrumbLink color='#919191' textDecoration='underline' display={"flex"} alignItems={"end"} href='#'>
            {secondPage}
          </BreadcrumbLink>
        </BreadcrumbItem>

        <BreadcrumbItem isCurrentPage>
          <BreadcrumbLink
            display={"flex"}
            alignItems={"end"}
            as={Link}
            to='/product' color='#1D1D1D'>
            {thirdPage}
          </BreadcrumbLink>
        </BreadcrumbItem>
      </Breadcrumb>
    </Box>
  );
};

export default Breadcrumbs;
