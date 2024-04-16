import {Flex, Heading, Text} from "@chakra-ui/react";

const FooterContacts: React.FC = () => {
    return (
        <Flex gap='16px' direction='column' w='288px'>
            <Heading as='h2' fontSize='18px' fontWeight='600'
                     textTransform='uppercase'>Contacts</Heading>
            <Flex color='#D1D1D1' fontWeight='400' fontSize='16px' direction='column' gap='12px'>
                <Text>Support</Text>
                <Text>FAQ</Text>
                <Text>Delivery & returns</Text>
                <Text>Contact us</Text>
                <Text>About us</Text>
                <Text>Moving your system</Text>
                <Text>Become a Partner</Text>
            </Flex>
        </Flex>
    )
}
export default FooterContacts