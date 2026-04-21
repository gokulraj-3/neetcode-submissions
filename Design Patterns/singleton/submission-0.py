class Singleton:
    instance = None
    def __new__(cls):
        if cls.instance is None:
            cls.instance = super(Singleton, cls).__new__(cls)
        return cls.instance
    def getValue(self) -> str:
        return self.value
    def setValue(self, value: str):
        self.value = value
