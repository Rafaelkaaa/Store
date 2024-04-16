import {Box, Flex, Heading} from "@chakra-ui/react";
import FooterProducts from "./FooterProducts.tsx";
import FooterContacts from "./FooterContacts.tsx";
import FooterBar from "./FooterBar.tsx";
import FooterWelcomeSection from "./FooterWelcomeSection.tsx";

const Footer: React.FC = () => {
    return (
        <Box as='footer'>
            <Box bg='#1D1D1D' color='#FFF'>
                <Flex gap='294px' maxWidth='1600px' margin='0 auto' p='44px 97px 60px 115px'>
                    <FooterWelcomeSection/>
                    <Flex gap='80px' paddingTop='12px'>
                        <Flex direction='column' gap='49px'>
                            <FooterProducts/>
                            <Heading as='h2' fontSize='18px' fontWeight='600' textTransform='uppercase'>Smart Home
                                Services</Heading>
                        </Flex>
                        <FooterContacts/>
                    </Flex>
                </Flex>
            </Box>
            <FooterBar/>
        </Box>
    )
}

export default Footer