import { Box, Button, Flex, Heading, Img, Text } from "@chakra-ui/react";
import { HeartIcon } from "../../img/Icons";
import ButtonAdd from "./ButtonAdd";

interface CardProps {
  id: number;
  name: string;
  price: number;
  sale: number;
  description: string;
}

const ProductCard: React.FC<CardProps> = ({
  id,
  name,
  description,
  price,
  sale,
}) => {
  return (
    <Flex flexDirection='column' alignItems='center' maxW={230} pb={'24px'}>
      <Flex flexDirection='column' alignItems='center' gap='24px'>
        <Img src='' m='15px 15px 0 15px' h={200} w={200} />
        <Heading
          maxW={230}
          p='0 15px 0'
          as='h3'
          fontSize={16}
          fontWeight={"300"}
          lineHeight={"110%"}>
          {name}
        </Heading>
        <Flex gap='8px' flexDir='column'>
          <Text
            maxW={200}
            m='0 15px 0'
            color={"#464646"}
            fontSize={16}
            fontWeight='600'
            lineHeight='130%'
            letterSpacing={'-0.48px'}>
            {description}
          </Text>
          <Flex fontSize='18px' alignSelf='center' color={"#464646"}>
            ${" "}
            {sale > 0 ? (
              <span>
                {sale}{" "}
                <del style={{ fontSize: "14px", color: "#919191" }}>
                  $ {price}
                </del>{" "}
              </span>
            ) : (
              <Box>{price}</Box>
            )}
          </Flex>
          <Flex gap={"16px"} justifyContent='center'>
            <ButtonAdd />
            <Flex alignItems='center' justifyContent='center'>
              <Button bg={"#fff"}>
                <HeartIcon />
              </Button>
            </Flex>
          </Flex>
        </Flex>
      </Flex>
    </Flex>
  );
};

export default ProductCard;
