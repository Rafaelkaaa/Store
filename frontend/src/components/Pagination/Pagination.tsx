import {ChevronLeftIcon, ChevronRightIcon} from "@chakra-ui/icons";
import {Flex} from "@chakra-ui/react";
import PageCount from "./components/PageCount";

const Pagination: React.FC = () => {
    return (
        <Flex
            mt={'35px'}
            alignSelf={"center"}
            justifyContent={"space-between"}
            borderRadius={"8px"}
            color='#000'
            border={"1px solid #D1D1D1"}>
            <Flex w={'118px'} gap={'6px'} p={"12px"} alignItems={"center"} fontSize={"14px"} as={"button"}>
                <ChevronLeftIcon boxSize={6}/>
                <Flex>Previous</Flex>
            </Flex>
            <PageCount/>
            <Flex justifyContent={'flex-end'} gap={'6px'} p={"12px"} alignItems={"center"} fontSize={"14px"}
                  as={"button"}>
                <Flex>Next</Flex>
                <ChevronRightIcon boxSize={6}/>
            </Flex>
        </Flex>
    );
};

export default Pagination;
