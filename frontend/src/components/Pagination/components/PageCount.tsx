import { Box, Button, Flex } from "@chakra-ui/react";
import { useState } from "react";

const PageCount: React.FC = () => {
  const [currentPage, setCurrentPage] = useState(1);
  const totalPages = 4;

  const handlePageClick = (pageNumber: number) => {
    setCurrentPage(pageNumber);
  };

  return (
    <Flex>
      <Flex alignItems={"center"}>
        {Array.from({ length: totalPages }, (_, index) => index + 1).map(
          (pageNumber) => (
            <Flex
              fontSize={"14px"}
              as={"button"}
              p={"12px 15px"}
              w={"48px"}
              h={"48px"}
              justifyContent={"center"}
              alignItems={"center"}
              key={pageNumber}
              onClick={() => handlePageClick(pageNumber)}
              border={
                currentPage === pageNumber ? "1px solid #1D1D1D" : "none"
              }>
              {pageNumber}
            </Flex>
          ),
        )}
      </Flex>
      <Flex
        fontSize={"14px"}
        as={"button"}
        p={"12px 15px"}
        w={"48px"}
        h={"48px"}
        justifyContent={"center"}
        alignItems={"center"}
        color={'#919191'}>
            ...
        </Flex>
        <Flex
        fontSize={"14px"}
        as={"button"}
        p={"12px 15px"}
        w={"48px"}
        h={"48px"}
        justifyContent={"center"}
        alignItems={"center"}
        color={'#919191'}>
            8
        </Flex>
    </Flex>
  );
};

export default PageCount;
