import { AddIcon, MinusIcon } from "@chakra-ui/icons";
import { AccordionButton, AccordionItem, AccordionPanel, Box, Flex, FormControl, Input } from "@chakra-ui/react";
import MainButton from "../../Buttons/MainButton";

const SearchFilter: React.FC = () => {
  return (
    <AccordionItem style={{ border: "none" }}>
      {({ isExpanded }) => (
        <>
          <h2>
            <AccordionButton p={"18px 16px 18px 4px"}>
              <Box as='span' flex='1' textAlign='left' fontWeight='600'>
                Find with key word
              </Box>
              {isExpanded ? (
                <MinusIcon fontSize='16px' />
              ) : (
                <AddIcon fontSize='16px' />
              )}
            </AccordionButton>
          </h2>
          <AccordionPanel p={"4px 4px 8px"}>
            <Flex pb={4} fontSize='sm' p={"0"} flexDir={"column"} gap={"8px"}>
              <FormControl>
                <Input
                  type='search'
                  borderRadius={"8px"}
                  w={"238px"}
                  focusBorderColor='purple.400'
                  border={"1.5px solid #D1D1D1"}
                  _focus={{
                    border: "1px purple.400 solid",
                  }}
                />
              </FormControl>
              <MainButton width='88px'>Search</MainButton>
            </Flex>
          </AccordionPanel>
        </>
      )}
    </AccordionItem>
  );
};

export default SearchFilter;
