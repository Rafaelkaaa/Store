import { Button, Flex, Text } from "@chakra-ui/react";
import { useState } from "react";
import { AddedIcon } from "../../img/Icons";

const ButtonAdd = () => {
  const [clicked, setClicked] = useState(false);

  const handleClick = () => {
    setClicked(true);
  };

  return (
    <div>
      {clicked ? (
        <Button
          display='flex'
          p='16px 32px'
          height='40px'
          width='160px'
          gap='8px'
          color='#1D1D1D'
          border={"2px solid #7EB96A"}
          background={"#fff"}
          alignItems='center'
          borderRadius='8px'
          onClick={handleClick}>
            <Flex gap={'6px'} alignItems={'center'}><Text>Added</Text><AddedIcon/></Flex>
        </Button>
      ) : (
        <Button
          display='flex'
          p='16px 32px'
          height='40px'
          width='160px'
          gap='8px'
          color='#fff'
          alignItems='center'
          borderRadius='8px'
          bgGradient='linear(to-r, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)'
          onClick={handleClick}>
          <Flex lineHeight={"20px"} gap={'6px'}>
            <Text>Add</Text>
            <span style={{ fontSize: "24px", lineHeight: "16px" }}>+</span>
          </Flex>
        </Button>
      )}
    </div>
  );
};

export default ButtonAdd;

// import google from '../../img/google.svg'
//  <Image src={google} />
