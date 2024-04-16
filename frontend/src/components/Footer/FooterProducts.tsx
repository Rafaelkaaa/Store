import {Flex, Heading, Text} from "@chakra-ui/react";

const FooterProducts: React.FC = () => {
    return (
        <Flex gap='16px' direction='column' w='288px'>
            <Heading as='h2' fontSize='18px' fontWeight='600' textTransform='uppercase'>Smart Home
                Products</Heading>
            <Flex color='#D1D1D1' fontWeight='400' fontSize='16px' direction='column' gap='12px'>
                <Text>Smart home security solutions</Text>
                <Text>Smart office solution</Text>
                <Text>Lighting and lighting technology</Text>
                <Text>Audio - Video</Text>
                <Text>Smart pool automation</Text>
                <Text>Smart home devices</Text>
                <Text>Smart home systems</Text>
                <Text>Building automation system</Text>
                <Text>Fire protection systems</Text>
            </Flex>
        </Flex>
    )
}

export default FooterProducts