import {Flex} from "@chakra-ui/react";
import {ActiveGridIcon1, ActiveGridIcon2, DisablGridIcon1, DisablGridIcon2} from "../../../assets/img/Icons.tsx";
import {useState} from "react";

const SortPlacement = () => {
    const [firstButtonActive, setFirstButtonActive] = useState(false);

    const handleFirstButtonClick = () => {
        setFirstButtonActive(true);
    };

    const handleSecondButtonClick = () => {
        setFirstButtonActive(false);
    };

    return (
        <Flex alignItems={"center"} gap={"8px"}>
            <Flex
                alignItems={"center"}
                backgroundColor={firstButtonActive ? "#1D1D1D" : "#F3F4F5"}
                borderRadius={"8px"}
                justifyContent={"center"}
                w={"34px"}
                h={"34px"}
                as={"button"}
                onClick={handleFirstButtonClick}
                style={{transition: "background-color 0.3s ease-in-out"}}>
                {firstButtonActive ? <DisablGridIcon1/> : <ActiveGridIcon1/>}
            </Flex>
            <Flex
                alignItems={"center"}
                justifyContent={"center"}
                backgroundColor={firstButtonActive ? "#F3F4F5" : "#1D1D1D"}
                borderRadius={"8px"}
                w={"34px"}
                h={"34px"}
                as={"button"}
                onClick={handleSecondButtonClick}
                style={{transition: "background-color 0.3s ease-in-out"}}>
                {firstButtonActive ? <DisablGridIcon2/> : <ActiveGridIcon2/>}
            </Flex>
        </Flex>
    )
}

export default SortPlacement