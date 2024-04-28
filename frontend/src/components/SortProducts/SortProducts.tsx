import {Box, Flex} from "@chakra-ui/react";
import React from "react";
import SortSize from "./components/SortSize.tsx";
import SortCategory from "./components/SortCategory.tsx";
import SortPlacement from "./components/SortPlacement.tsx";

const SortProducts: React.FC = () => {

    return (
        <Flex gap='210px' align='center'>
            <Flex gap={"21px"} align='center'>
                <SortPlacement />
                <SortSize/>
            </Flex>
            <Box color='#1D1D1D' h='21px'>
                297 products found
            </Box>
            <SortCategory/>
        </Flex>
    );
};

export default SortProducts;
