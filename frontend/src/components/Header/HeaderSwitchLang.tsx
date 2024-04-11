import {Box, Tab, TabList, Tabs} from "@chakra-ui/react";
import React from "react";

const HeaderSwitchLang: React.FC = () => {
    return (
        <Tabs variant='unstyled' defaultIndex={1}>
            <TabList h='24px' alignItems='center' p='5px' color='rgba(249, 249, 249, 0.3)'>
                <Tab p='0' paddingRight='12px' fontFamily='Inter'
                     _selected={{color: '#FFF'}}>UA</Tab>
                <Box display='block' w='2px' h='14px' bg='rgba(249, 249, 249, 0.3)'/>
                <Tab p='0' paddingLeft='12px' fontFamily='Inter' fontWeight='400'
                     _selected={{color: '#FFF'}}>EN</Tab>
            </TabList>
        </Tabs>
    )
}

export default HeaderSwitchLang