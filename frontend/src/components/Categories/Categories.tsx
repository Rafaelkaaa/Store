import { Box, Center, Divider, Flex, Img, Text } from "@chakra-ui/react";

import cameraCategoryImg from "../../img/cameraCategoryImg.png";
import { ChevronRightIcon } from "@chakra-ui/icons";


const Categories: React.FC = () => {
  return (
    <Flex gap={"50px"}>
      <Flex>
        <Flex flexDir={"column"} mr={"21px"} gap={"24px"} p={"20px"} bg='#F8F9FA' borderRadius='16px'>
          <Img src={cameraCategoryImg} />
          <Text
            fontWeight={"600"}
            bgGradient='linear(to-r, #5FD8FF 0%, #9969FF 50%, #FF4B4B 100%)'
            bgClip='text'
            textAlign={"center"}
            fontSize={"20px"}>
            Security Cameras
          </Text>
        </Flex>
        <Center>
          <Divider
            height='100%'
            orientation='vertical'
            borderColor='#5FD8FF'
            borderWidth='2px'
          />
        </Center>
      </Flex>
      <Flex gap={"200px"} alignSelf={"center"}>
        <Flex flexDir='column' gap='20px' alignItems='flex-start' color='#1D1D1D' >
          <Flex alignItems='center' fontSize='20px' h='22px' as='button' fontWeight='600'>
            <ChevronRightIcon boxSize={7} />
            <Box>Wireless Security Cameras</Box>
          </Flex>
          <Flex alignItems='center' fontSize='20px' h='22px' as='button' fontWeight='600'>
            <ChevronRightIcon boxSize={7} />
            <Box color={"#EC5851"}>Best Sellers</Box>
          </Flex>
          <Flex alignItems='center' fontSize='20px' h='22px' as='button' fontWeight='600'>
            <ChevronRightIcon boxSize={7} />
            <Box>New Cameras 2024</Box>
          </Flex>
        </Flex>
        <Flex flexDir='column' gap='20px' alignItems='flex-start'>
          <Flex alignItems='center' fontSize='20px' h='22px' as='button' fontWeight='600'>
            <ChevronRightIcon boxSize={7} />
            <Box>Surveillance Kits</Box>
          </Flex>
          <Flex alignItems='center' fontSize='20px' h='22px' as='button' fontWeight='600'>
            <ChevronRightIcon boxSize={7} />
            <Box>Smart Home Devices</Box>
          </Flex>
          <Flex alignItems='center' fontSize='20px' h='22px' as='button' fontWeight='600'>
            <ChevronRightIcon boxSize={7} />
            <Box>Surveillance Accessories</Box>
          </Flex>
        </Flex>
      </Flex>
    </Flex>
  );
};

export default Categories;
