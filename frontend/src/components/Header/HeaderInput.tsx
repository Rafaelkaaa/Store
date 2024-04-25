import {Box, Button, Image, Input, InputGroup, InputLeftElement} from "@chakra-ui/react";
import SearchIcon from "../../assets/img/search.png";
import React from "react";

const HeaderInput: React.FC = () => {
    return (
        <InputGroup>
            <InputLeftElement pointerEvents='none'>
                <Image src={SearchIcon} alt='SearchIcon'/>
            </InputLeftElement>
            <Input placeholder='Search' bg='#fff' borderRadius='8px 0px 0px 8px' color='#3A3F49'
                   variant='unstyled' w='216px' h='40px'/>
            <Box bg='#fff' borderRadius='0px 15px 15px 0px'>
                <Button borderRadius='8px'
                        bg='linear-gradient(92deg, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)'
                        color='#FFF' fontSize='14px'
                        fontWeight='500' p='10px 19px'
                        variant='unstyled' minWidth='unset' letterSpacing='0.1px' lineHeight='20px'
                        w='88px'>
                    Search
                </Button>
            </Box>
        </InputGroup>
    )
}

export default HeaderInput