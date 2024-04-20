import { AddIcon, MinusIcon } from "@chakra-ui/icons";
import {
  AccordionButton,
  AccordionItem,
  AccordionPanel,
  Box,
  Checkbox,
  Flex,
  Stack,
} from "@chakra-ui/react";
import { useState } from "react";

const CategoriesFilter: React.FC = () => {
  const [checkedItems, setCheckedItems] = useState([false, false]);
  const isIndeterminate = checkedItems.some(Boolean);

  return (
    <AccordionItem>
      {({ isExpanded }) => (
        <>
          <h2>
            <AccordionButton p={"18px 16px 18px 4px"}>
              <Box as='span' flex='1' textAlign='left' fontWeight='600'>
                Categories
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
            <Checkbox
              colorScheme='brand'
              isIndeterminate={isIndeterminate}
              onChange={(e) =>
                setCheckedItems([e.target.checked, e.target.checked])
              }
              color='#9169F7'>
              Parent Checkbox 1
            </Checkbox>
            <Stack pl={6} mt={1} gap={"4px"}>
              <Checkbox
                colorScheme='brand'
                isChecked={checkedItems[0]}
                onChange={(e) =>
                  setCheckedItems([e.target.checked, checkedItems[1]])
                }>
                Child Checkbox 1
              </Checkbox>
              <Checkbox
                colorScheme='brand'
                isChecked={checkedItems[1]}
                onChange={(e) =>
                  setCheckedItems([checkedItems[0], e.target.checked])
                }>
                Child Checkbox 2
              </Checkbox>
            </Stack>
            <Flex color='#9169F7' flexDir={"column"} gap={"4px"}>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
              <Checkbox colorScheme='brand'>Checkbox</Checkbox>
            </Flex>
          </AccordionPanel>
        </>
      )}
    </AccordionItem>
  );
};

export default CategoriesFilter;
