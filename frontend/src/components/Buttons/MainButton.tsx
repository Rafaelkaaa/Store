import { Button } from "@chakra-ui/react";

interface MainButtonProps {
  children: string;
  width: string;
}

const MainButton: React.FC<MainButtonProps> = ({ children, width }) => {
  return (
    <Button
      display={"flex"}
      p={"12px 20px"}
      alignItems={"center"}
      colorScheme='blue'
      width={width}
      borderRadius={'8px'}
      h='42px'
      bg='linear-gradient(92deg, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)'
      _hover={{
        bg: "linear-gradient(92deg, #5FD8FF 0.39%, #9969FF 65.86%, #704FE5 102.04%)",
        top: "2px",
      }}>
      {children}
    </Button>
  );
};

export default MainButton;
