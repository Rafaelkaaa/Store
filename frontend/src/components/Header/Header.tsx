import React from "react";
import {
    Box, Button,
    Flex,
    Image, Menu, MenuButton

} from "@chakra-ui/react";
import Logo from '../../img/logo.png'
import LoginIcon from '../../img/login.png'
import BasketIcon from '../../img/basket.png'
import HeaderInput from "./HeaderInput.tsx";
import HeaderSwitchLang from "./HeaderSwitchLang.tsx";
import ChevronDown from "../../img/chevron-down.png";
import HeaderMenuProducts from "./HeaderMenuProducts.tsx";
const Header: React.FC = () => {
    console.log('Checked!!!!')
    return (
        <Box bg='#191D24' position='relative'>
            <Flex as='header' color='#F9F9F9' margin='0 auto' position='relative'
                  gap='33px' align='center' maxWidth='1600px' p='16px 123px 15px 106px'  alignItems='center' >
                <Box>
                    <Image src={Logo} alt='Logo' w='200px' h='60px'/>
                </Box>
               <HeaderMenuProducts />
                <Menu>
                    <MenuButton as={Button} p='0' rightIcon={<Image src={ChevronDown} alt='chevronDown'/>}
                                fontSize='16px'
                                fontFamily='Inter'
                                fontWeight='400' bg='#191D24' color='rgba(249, 249, 249, 1)'
                                _hover={{bg: '#191D24'}}
                                _active={{bg: '#191D24'}} _focus={{bg: '#191D24'}}>
                        Smart Home Services
                    </MenuButton>
                </Menu>
                <Menu>
                    <MenuButton as={Button} p='0' rightIcon={<Image src={ChevronDown} alt='chevronDown'/>}
                                fontSize='16px'
                                fontFamily='Inter'
                                fontWeight='400' bg='#191D24' color='rgba(249, 249, 249, 1)'
                                _hover={{bg: '#191D24', border: 'none'}}
                                _active={{bg: '#191D24'}} _focus={{bg: '#191D24'}}>
                        Support
                    </MenuButton>
                </Menu>
                <Box>
                    <HeaderInput/>
                </Box>
                <Box>
                    <HeaderSwitchLang/>
                </Box>
                <Flex gap='16px' align='center' fontFamily='Inter'>
                    <Flex align='center' direction='column' w='48px' textAlign='center'
                          marginTop='auto' paddingBottom='6px'>
                        <Image src={LoginIcon} alt='LoginIcon'/>
                        <Box h='18px'>
                            Login
                        </Box>
                    </Flex>
                    <Flex direction='column' align='center' position='relative' w='52px' h='61px'
                          p='13px 12.5px 0px 7.5px' textAlign='center'>
                        <Image src={BasketIcon} alt='BasketIcon'/>
                        <Box h='18px'>
                            Cart
                        </Box>
                        <Box position='absolute' textAlign='center' bg='#FF4B4B' top='0' right='0' w='25px' h='25px'
                             borderRadius='50%'>3</Box>
                    </Flex>
                </Flex>
            </Flex>
        </Box>
    )
}

export default Header

