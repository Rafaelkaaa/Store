import {Box, Button, Flex, Image, Menu, MenuButton, MenuItem, MenuList} from "@chakra-ui/react";
import chevronUp from "../../../assets/img/chevronUpSelect.svg";
import chevronDown from "../../../assets/img/chevronDownSelect.svg";
import React, {useState} from "react";

const SortCategory:React.FC = () => {
    const [isOpenSort, changeOpenSort] = useState(false);
    const [selectedOptionSort, setSelectedOptionSort] = useState<string>('Most Popular');

    const handleSelectedOptionSort = (value: string) => {
        changeOpenSort(!isOpenSort)
        setSelectedOptionSort(value)
    }

    return (
        <Flex gap='16px' align='center'>
            <Box>Sort</Box>
            <Menu isOpen={isOpenSort}>
                <MenuButton as={Button} w='240px' h='37px' border='1px solid #515151' borderRadius='8px' bg='#FFF'
                            fontWeight='400' _hover={{bg: '#FFF'}} _focus={{bg: '#FFF'}} _active={{bg: '#FFF'}}
                            color='#515151' fontSize='16px' transition='none'
                            p='8px 18px 8px 21px' gap='40px' textAlign='left'
                            rightIcon={isOpenSort ? <Image w='24px' h='24px' src={chevronUp} alt='chevronDown'/> :
                                <Image w='24px' h='24px' src={chevronDown} alt='chevronDown'/>}
                            onClick={() => changeOpenSort(!isOpenSort)}
                >
                    {selectedOptionSort}
                </MenuButton>
                <MenuList transition='none' marginTop='-8px' minW='unset' w='240px' h='100%' p='0' border='unset'
                          borderRadius='8px' color="#515151"
                          shadow='unset' boxShadow='0px 4px 4px 0px rgba(0, 0, 0, 0.15)'>
                    <MenuItem  w='240px' p='8px 18px 8px 21px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                               onClick={() => {
                                   handleSelectedOptionSort('Most Popular')
                               }}>Most Popular</MenuItem>
                    <MenuItem w='240px' p='8px 18px 8px 21px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                              onClick={() => {
                                  handleSelectedOptionSort('Price: High to Low')
                              }}>Price: High to Low</MenuItem>
                    <MenuItem w='240px' p='8px 18px 8px 21px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                              onClick={() => {
                                  handleSelectedOptionSort('Price: Low to High')
                              }}>Price: Low to High</MenuItem>
                    <MenuItem w='240px' p='8px 18px 8px 21px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                              onClick={() => {
                                  handleSelectedOptionSort('Most Relevant')
                              }}>Most Relevant</MenuItem>
                    <MenuItem w='240px' p='8px 18px 8px 21px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                              onClick={() => {
                                  handleSelectedOptionSort('Alphabetical')
                              }}>Alphabetical</MenuItem>
                </MenuList>
            </Menu>
        </Flex>
    )
}

export default SortCategory