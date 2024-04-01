import { Button, Image, Text } from "@chakra-ui/react";
import { PlusIcon } from "../../img/Icons";


const ButtonAdd = () => {
  return (
    <>
      <Button
        display='flex'
        size='md'
        p={"16px 32px"}
        height='40px'
        width='160px'
        gap='8px'
        color='#fff'
        alignItems={"center"}
        borderRadius='8px'
        bgGradient='linear(to-r, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)'
        _hover={{ bg: " " }}>
        <Text>Add</Text>
        <PlusIcon />
      </Button>
    </>
  );
};

export default ButtonAdd;



// import google from '../../img/google.svg'
//  <Image src={google} /> 