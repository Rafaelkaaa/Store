import { Button, Flex, Text } from "@chakra-ui/react";
import { useState } from "react";
import { AddedIcon } from "../../assets/img/Icons";
import { AddIcon } from "@chakra-ui/icons";

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
          alignItems='center'
          borderRadius='8px'
          onClick={handleClick}>
          <Flex gap={"6px"} alignItems={"center"}>
            <Text>Added</Text>
            <AddedIcon />
          </Flex>
        </Button>
      ) : (
        <Button
          display='flex'
          p='12px 18px'
          height='40px'
          width='160px'
          lineHeight={"100%"}
          gap='8px'
          color='#fff'
          alignItems='center'
          borderRadius='8px'
          bgGradient='linear(to-r, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)'
          _hover={{
            bg: "linear-gradient(92deg, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)",
            top: "2px",
          }}
          onClick={handleClick}>
          <Flex gap={"6px"} alignItems={"center"}>
            <Text>Add</Text>
            <AddIcon />
          </Flex>
        </Button>
      )}
    </div>
  );
};

export default ButtonAdd;
