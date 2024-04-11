import {Box, Button, Flex, Image, Menu, MenuItem} from "@chakra-ui/react";
import ChevronDown from "../../img/chevron-down.png";
import s from "./Header.module.css";
import categories from "../../data/categoryHeader.json";
import menuBackground from "../../img/menuBackground.png";
import React, {useState} from "react";

const HeaderMenuProducts:React.FC = () => {
    const [ isOpen, changeOpen ] = useState(false)

    const handleOpen = () => {
        if(!isOpen) {
            changeOpen(true)
        }
    }

    const handleClose = () => {
        changeOpen(false)
    }

    return (
        <Menu isOpen={isOpen} >
            <Button as={Button} p='0' rightIcon={<Image src={ChevronDown} alt='chevronDown'/>}
                    fontSize='16px'
                    fontFamily='Inter'
                    fontWeight='400' bg='#191D24' color='rgba(249, 249, 249, 1)'
                    _hover={{bg: '#191D24', color: '#9169F7', textDecoration: 'underline'}}
                    _active={{bg: '#191D24'}}
                    _focus={{bg: '#191D24', boxShadow:'none'}}
                    onMouseEnter={handleOpen}

            >
                Smart Home Products
            </Button>

            <Box  className={`${s.dropdown} ${isOpen? s.open : ''}`} onMouseLeave={handleClose} position='absolute' top='92px' w='1370px' transform='translateX(-50%)' left='50%'  padding='23px 71px 37px 34px'  borderRadius='0px 0px 16px 16px' color='#000' bg='#fff' zIndex={1}>
                <Flex gap='68px'>
                    <Box>
                        {categories.map((category) => (
                            <MenuItem key={category.id} _hover={{bg: '#E4D9FD', borderRadius: '8px'}}>{category.category}</MenuItem>
                        ))}
                    </Box>
                    <Image paddingTop='12px' h='306px' src={menuBackground} alt='menuBackground'/>
                </Flex>
            </Box>
        </Menu>
    )
}

export default HeaderMenuProducts