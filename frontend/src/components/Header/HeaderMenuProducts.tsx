import {Box, Button, Flex, Image, Menu, MenuItem} from "@chakra-ui/react";
import ChevronDown from "../../assets/img/chevron-down.png";
import s from "./Header.module.css";
import categories from "../../data/categoryHeader.json";
import menuBackground from "../../assets/img/menuBackground.png";
import React, {useState} from "react";
import imageCategory01 from "./../../assets/img/headerCategoriesImages/categoryImage01.png"
import imageCategory02 from "./../../assets/img/headerCategoriesImages/categoryImage02.png"
import imageCategory03 from "./../../assets/img/headerCategoriesImages/categoryImage03.png"
import imageCategory04 from "./../../assets/img/headerCategoriesImages/categoryImage04.png"
import imageCategory05 from "./../../assets/img/headerCategoriesImages/categoryImage05.png"
import imageCategory06 from "./../../assets/img/headerCategoriesImages/categoryImage06.png"
import imageCategory07 from "./../../assets/img/headerCategoriesImages/categoryImage07.png"
import imageCategory08 from "../../assets/img/headerCategoriesImages/categoryImage08.png"
import imageCategory09 from "../../assets/img/headerCategoriesImages/categoryImage09.png"

const HeaderMenuProducts: React.FC = () => {
    const [isOpen, changeOpen] = useState(false);
    const [selectedItem, setSelectedItem] = useState<string | null>(null);

    const images =
        [
            {"title": "Smart Home Security Solutions", "image": imageCategory01},
            {"title": "Smart Office Solution", "image": imageCategory02},
            {"title": "Lighting and Lighting Technology", "image": imageCategory03},
            {"title": "Smart Audio - Video", "image": imageCategory04},
            {"title": "Smart Pool Automation", "image": imageCategory05},
            {"title": "Smart Home Devices", "image": imageCategory06},
            {"title": "Smart Home Systems", "image": imageCategory07},
            {"title": "Building Automation System", "image": imageCategory08},
            {"title": "Fire Protection Systems", "image": imageCategory09}
        ]
    const handleOpen = () => {
        changeOpen(true);
    };

    const handleClose = () => {
        changeOpen(false);
        setSelectedItem(null)
    };

    const handleItemSelected = (itemName: string) => {
        setSelectedItem(itemName);
    };

    return (
        <Menu isOpen={isOpen}>
            <Button
                as={Button}
                p='0'
                rightIcon={<Image src={ChevronDown} alt='chevronDown'/>}
                fontSize='16px'
                fontWeight='400'
                bg='#191D24'
                color='rgba(249, 249, 249, 1)'
                _hover={{
                    bg: "#191D24",
                    color: "#9169F7",
                    textDecoration: "underline",
                }}
                _active={{bg: "#191D24"}}
                _focus={{bg: "#191D24", boxShadow: "none"}}
                onMouseEnter={handleOpen}
                onMouseLeave={handleClose}
            >
                Smart Home Products
            </Button>
            <Box
                className={`${s.dropdown} ${isOpen ? s.open : ""}`}
                onMouseLeave={handleClose}
                onMouseEnter={handleOpen}
                position='absolute'
                top='62px'
                w='1370px'
                transform='translateX(-50%)'
                left='50%'
                borderRadius='0px 0px 16px 16px'
                color='#000'
                bg='transparent'>
                <Box
                    mt={'30px'}
                    w='1370px'
                    padding='23px 71px 37px 34px'
                    borderRadius='0px 0px 16px 16px'
                    color='#000'
                    bg='#fff'>
                    <Flex gap='32px'>
                        <Box>
                            {categories.map((category) => (
                                <MenuItem
                                    w='288px'
                                    key={category.id}
                                    _focus={{bg: '#FFF'}}
                                    _hover={{bg: "#E4D9FD", borderRadius: "8px"}}
                                    onMouseEnter={() => handleItemSelected(category.category)}
                                >
                                    {category.category}
                                </MenuItem>
                            ))}
                        </Box>
                        {selectedItem ?
                            <Flex gap='24px' direction='column' textAlign='center' p='20px' bg='#F8F9FA'
                                  borderRadius='16px' h='326px'>
                                <Image src={images.find(item => item.title === selectedItem)?.image} w='200px' h='202px'
                                       alt='categoryImage'/>
                                <Box fontSize='20px' fontWeight='600'
                                     background='linear-gradient(104deg, #5FD8FF -7%, #9969FF 42.06%, #FF4B4B 91.11%)'
                                     backgroundClip='text' maxW='200px' as={'p'}
                                     letterSpacing='-0.6px'>{selectedItem}</Box>
                            </Flex> :
                            <Image
                                paddingTop='12px'
                                h='306px'
                                src={menuBackground}
                                alt='menuBackground'
                            />
                        }
                    </Flex>
                </Box>
            </Box>
        </Menu>
    );
};

export default HeaderMenuProducts