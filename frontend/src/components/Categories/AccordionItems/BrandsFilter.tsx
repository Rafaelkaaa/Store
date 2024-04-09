import {
  AccordionButton,
  AccordionItem,
  AccordionPanel,
  Box,
  Checkbox,
  Flex,
} from "@chakra-ui/react";
import { AddIcon, MinusIcon } from "@chakra-ui/icons";

const BrandsFilter: React.FC = () => {
  return (
    <AccordionItem>
      {({ isExpanded }) => (
        <>
          <h2>
            <AccordionButton p={"18px 16px 18px 4px"}>
              <Box as='span' flex='1' textAlign='left' fontWeight='500'>
                Featured Brands
              </Box>
              {isExpanded ? (
                <MinusIcon fontSize='16px' />
              ) : (
                <AddIcon fontSize='16px' />
              )}
            </AccordionButton>
          </h2>
          <AccordionPanel
            p={"0 4px 8px"}
            fontSize='sm'
            display={"flex"}
            gap={"4px"}
            flexDir={"column"}>
            <Flex  flexDir={"column"} gap={"4px"}>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
            </Flex>
          </AccordionPanel>
        </>
      )}
    </AccordionItem>
  );
};

export default BrandsFilter;
