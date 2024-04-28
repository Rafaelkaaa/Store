import {Flex} from "@chakra-ui/react";
import {AddIcon} from "@chakra-ui/icons";

const LoadMore: React.FC = () => {
    return (
        <Flex mt={'35px'} alignSelf={'center'} as={"button"} alignItems={"center"} gap={'8px'}>
            <Flex fontSize={'18px'} fontWeight={"500"}>Load more</Flex>
            <AddIcon/>
        </Flex>
    );
};

export default LoadMore;
