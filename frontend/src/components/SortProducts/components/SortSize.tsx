import {FC, useState} from "react";
import {Button, Image, Menu, MenuButton, MenuItem, MenuList} from "@chakra-ui/react";
import chevronUp from "../../../assets/img/chevronUpSelect.svg";
import chevronDown from "../../../assets/img/chevronDownSelect.svg";

const SortSize: FC = () => {
    const [isOpenSize, changeOpenSize] = useState(false);
    const [selectedOptionSize, setSelectedOptionSize] = useState<string>('24');

    const handleSelectedOptionSize = (value: string) => {
        changeOpenSize(!isOpenSize)
        setSelectedOptionSize(value)
    }

    return (
        <Menu isOpen={isOpenSize}>
            <MenuButton as={Button} w='112px' h='37px' border='1px solid #515151' borderRadius='8px' bg='#FFF'
                        fontWeight='400' _hover={{bg: '#FFF'}} _focus={{bg: '#FFF'}} _active={{bg: '#FFF'}}
                        color='#515151' fontSize='16px' transition='none'
                        p='8px 13px' gap='40px'
                        rightIcon={isOpenSize ? <Image w='24px' h='24px' src={chevronUp} alt='chevronDown'/> :
                            <Image w='24px' h='24px' src={chevronDown} alt='chevronDown'/>}
                        onClick={() => changeOpenSize(!isOpenSize)}
            >
                {selectedOptionSize}
            </MenuButton>
            <MenuList transition='none' marginTop='-8px' minW='unset' w='112px' h='100%' p='0' border='unset'
                      borderRadius='8px' color="#515151"
                      shadow='unset' boxShadow='0px 4px 4px 0px rgba(0, 0, 0, 0.15)'>
                <MenuItem w='112px' p='8px 13px'  borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                          onClick={() => {
                              handleSelectedOptionSize('24')
                          }}>24</MenuItem>
                <MenuItem w='112px' p='8px 13px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                          onClick={() => {
                              handleSelectedOptionSize('48')
                          }}>48</MenuItem>
                <MenuItem w='112px' p='8px 13px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                          onClick={() => {
                              handleSelectedOptionSize('100')
                          }}>100</MenuItem>
                <MenuItem w='112px' p='8px 13px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                          onClick={() => {
                              handleSelectedOptionSize('200')
                          }}>200</MenuItem>
                <MenuItem w='112px' p='8px 13px' borderRadius='8px' _hover={{bg: "#E4D9FD", color: "#1D1D1D"}}
                          onClick={() => {
                              handleSelectedOptionSize('All')
                          }}>All</MenuItem>
            </MenuList>
        </Menu>
    )
}

export default SortSize